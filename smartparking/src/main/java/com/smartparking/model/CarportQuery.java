/**
 * 公司：金刚葫芦娃
 * 文件名：CarportQuery
 * 作者：ZhaoJinGang
 * 时间：2019/7/3 10:39
 * 描述：
 */

package com.smartparking.model;

import java.util.Date;

public class CarportQuery extends Carport {

    private Date nowTime;

    public Date getNowTime() {
        return nowTime;
    }

    public void setNowTime(Date nowTime) {
        this.nowTime = nowTime;
    }
}
