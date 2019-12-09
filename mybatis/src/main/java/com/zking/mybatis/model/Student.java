package com.zking.mybatis.model;

import com.zking.mybatis.util.PinYinUtil;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * @author dong
 * @create 2019-11-1221:13
 */
@ToString
public class Student {
    public static  interface  Add{};
    public static  interface  Edit{};


    @NotNull(message = "id不能为空", groups = Edit.class)
    private Integer sid;
    @NotBlank(message = "姓名不能为空", groups ={ Add.class, Edit.class})
    private String name;
    @NotNull(message = "年龄不能为空", groups ={ Add.class, Edit.class})
    private Integer age;

    private String snamePinyin;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        this.snamePinyin= PinYinUtil.toPinyin(name);
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSnamePinyin() {
        return snamePinyin;
    }

    public void setSnamePinyin(String snamePinyin) {
        this.snamePinyin = snamePinyin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(sid, student.sid) &&
                Objects.equals(name, student.name) &&
                Objects.equals(age, student.age) &&
                Objects.equals(snamePinyin, student.snamePinyin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, name, age, snamePinyin);
    }
}
