package com.xeld.cashier.fragment;

import androidx.fragment.app.Fragment;

public class HomePayFragment extends Fragment {

    // 1. 补全 switch-case 所需的支付类型常量
    public static final int PAY_TYPE_CARH = 1;
    public static final int PAY_TYPE_CODE = 2;
    public static final int PAY_TYPE_MEMBER = 3;
    public static final int PAY_TYPE_MEMBER_OLD = 4;
    public static final int PAY_TYPE_MEMBER_HHZF = 5;

    // 2. 补全 TestActivity 调用的扫码与打印方法
    public void orderUnionPay(String code) {
        // 扫码支付存根方法
    }

    public void printOrderInfo() {
        // 打印订单信息存根方法
    }
}
