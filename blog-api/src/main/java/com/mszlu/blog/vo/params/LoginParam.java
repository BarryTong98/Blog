package com.mszlu.blog.vo.params;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class LoginParam {
    private String account;

    private String password;

    private String nickname;
}
