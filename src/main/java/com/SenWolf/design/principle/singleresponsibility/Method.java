package com.SenWolf.design.principle.singleresponsibility;

/**
 * @author SenWolf
 * @date 2021/12/9 14:35
 */
public class Method {
    private void updateUserInfo(String username, String address) {
        username = "";
        address = "";
    }

    private void updateUserInfo(String username, String... properties) {
        username = "";
        // address = "";
    }

    private void updateUserName(String userName) {

    }

    private void updateUserAddress(String address) {}

}
