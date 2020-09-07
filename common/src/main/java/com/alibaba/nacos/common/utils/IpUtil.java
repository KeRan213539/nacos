/*
 * Copyright 1999-2018 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.nacos.common.utils;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ip tool.
 *
 * @author Nacos
 */
public class IpUtil {
    
    public static final boolean PREFER_IPV6_ADDRESSES = Boolean.parseBoolean(System.getProperty("java.net.preferIPv6Addresses"));
    
    public static final String IPV6_START_MARK = "[";
    
    public static final String IPV6_END_MARK = "]";
    
    public static final int SPLIT_IP_PORT_RESULT_LENGTH = 2;
    
    private static final String LOCAL_HOST_IP_V4 = "127.0.0.1";
    
    private static final String LOCAL_HOST_IP_V6 = "[::1]";
    
    private static Pattern ipv4Pattern = Pattern.compile("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}");
    
    /**
     * get localhost ip.
     * @return java.lang.String
     */
    public static String localHostIp() {
        if (PREFER_IPV6_ADDRESSES) {
            return LOCAL_HOST_IP_V6;
        }
        return LOCAL_HOST_IP_V4;
    }
    
    /**
     * check whether the ip address is IPv4.
     *
     * @param addr ip address
     * @return boolean
     */
    public static boolean isIpv4(String addr) {
        try {
            return InetAddress.getByName(addr).getAddress().length == 4;
        } catch (UnknownHostException e) {
            return false;
        }
    }
    
    /**
     * check whether the ip address is IPv6.
     *
     * @param addr ip address
     * @return boolean
     */
    public static boolean isIpv6(String addr) {
        try {
            return InetAddress.getByName(addr).getAddress().length == 16;
        } catch (UnknownHostException e) {
            return false;
        }
    }
    
    /**
     * check whether the str is ip address (IPv4 or IPv6).
     *
     * @param addr ip address str
     * @return boolean
     */
    public static boolean isIp(String addr) {
        try {
            InetAddress.getByName(addr);
            return true;
        } catch (UnknownHostException e) {
            return false;
        }
    }
    
    /**
     * Check if the address contains a port.
     * 2020/9/3 14:53
     * @param address address string
     * @return boolean
     */
    public static boolean containsPort(String address) {
        return splitIpPortStr(address).length == 2;
    }
    
    /**
     * Split IP and port strings, support IPv4 and IPv6, IP in IPv6 must be enclosed with [].
     *
     * @param str ip and port string
     * @return java.lang.String[]
     */
    public static String[] splitIpPortStr(String str) {
        if (StringUtils.isBlank(str)) {
            throw new IllegalArgumentException("ip and port string cannot be empty!");
        }
        String[] serverAddrArr;
        if (str.startsWith(IPV6_START_MARK) && StringUtils.containsIgnoreCase(str, IPV6_END_MARK)) {
            if (str.endsWith(IPV6_END_MARK)) {
                serverAddrArr = new String[1];
                serverAddrArr[0] = str;
            } else {
                serverAddrArr = new String[2];
                serverAddrArr[0] = str.substring(0, (str.indexOf(IPV6_END_MARK) + 1));
                serverAddrArr[1] = str.substring((str.indexOf(IPV6_END_MARK) + 2));
            }
            if (!isIpv6(serverAddrArr[0])) {
                throw new IllegalArgumentException("The IPv6 address(\"" + serverAddrArr[0] + "\") is incorrect.");
            }
        } else {
            serverAddrArr = str.split(":");
            if (serverAddrArr.length > SPLIT_IP_PORT_RESULT_LENGTH) {
                throw new IllegalArgumentException("The IP address(\"" + str
                        + "\") is incorrect. If it is an IPv6 address, please use [] to enclose the IP part!");
            }
            if (!isIpv4(serverAddrArr[0])) {
                throw new IllegalArgumentException("The IPv4 address(\"" + serverAddrArr[0] + "\") is incorrect.");
            }
        }
        return serverAddrArr;
    }
    
    /**
     * Resolve the IP from the string containing the IP address.
     * @param str string containing IP address
     * @return java.lang.String
     */
    public static String getIpFromString(String str) {
        if (StringUtils.isBlank(str)) {
            return "";
        }
        String result = "";
        if (StringUtils.containsIgnoreCase(str, IPV6_START_MARK) && StringUtils.containsIgnoreCase(str, IPV6_END_MARK)) {
            result = str.substring(str.indexOf(IPV6_START_MARK), (str.indexOf(IPV6_END_MARK) + 1));
            if (!isIpv6(result)) {
                result = "";
                //throw new IllegalArgumentException("The IPv6 address(\"" + result + "\") is incorrect.");
            }
        } else {
            Matcher m = ipv4Pattern.matcher(str);
            if (m.find()) {
                result = m.group();
                if (!isIpv4(result)) {
                    result = "";
                    //throw new IllegalArgumentException("The IPv4 address(\"" + result + "\") is incorrect.");
                }
            }
            //throw new IllegalArgumentException("There is no IP in the string.");
        }
        return result;
    }
    
}