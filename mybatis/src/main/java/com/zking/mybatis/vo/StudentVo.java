package com.zking.mybatis.vo;

import com.zking.mybatis.model.Student;

import java.util.List;

/**vo对象一般用于传递参数；或存放页面显示的试图数据，
 * 与数据库中的表并不存在对应的关系，这一点与model或entity不同的地方，
 * 不同使用vo对象
 * @author dong
 * @create 2019-11-1318:10
 */
public class StudentVo extends Student {

private List<Integer> sids;


    public List<Integer> getSids() {
        return sids;
    }

    public void setSids(List<Integer> sids) {
        this.sids = sids;
    }
}
