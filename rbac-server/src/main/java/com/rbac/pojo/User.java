package com.rbac.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * @author JIAJUN KOU
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class User {

    private Integer id;
    private Integer dept_id;
    private String username;
    private String password;
    private String gender;
    private String tel;
    private String email;
    private String avatar;
    private String job_title;
    private Integer status;
    private Integer sort;
    private Integer del_flag;
    private Integer create_by;
    private LocalDate update_time;
    private LocalDate create_time;

}
