/**
 * 公司：金刚葫芦娃
 * 文件名：UserQuery
 * 作者：ZhaoJinGang
 * 时间：2019/6/26 15:36
 * 描述：
 */

package com.smartparking.model;

import com.smartparking.model.User;

public class UserQuery extends User {

    private Double minBalance;

    private Double maxBalance;

    public Double getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(Double minBalance) {
        this.minBalance = minBalance;
    }

    public Double getMaxBalance() {
        return maxBalance;
    }

    public void setMaxBalance(Double maxBalance) {
        this.maxBalance = maxBalance;
    }
}
