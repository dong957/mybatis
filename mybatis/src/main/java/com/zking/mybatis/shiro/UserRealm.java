package com.zking.mybatis.shiro;

import com.zking.mybatis.model.TSysUser;
import com.zking.mybatis.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;

/**
 * @author dong
 * @create 2019-12-0520:24
 */
public class UserRealm extends AuthorizingRealm {


    @Resource
    private UserService userService;


    /**
     * 授权
     * @param principals
     * @return
     */

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
      String username=principals.getPrimaryPrincipal().toString();
      //生成授权信息
       SimpleAuthorizationInfo authorizationInfo=new SimpleAuthorizationInfo();
        authorizationInfo.addRoles(userService.getRolesByUserName(username));
        authorizationInfo.setStringPermissions(userService.getPermissionsByUserName(username));


        return authorizationInfo;
    }


    /**
     * 认证
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

      String username=token.getPrincipal().toString();
        System.out.println(username);
        TSysUser user=userService.load(username);
        if(ObjectUtils.isEmpty(user)){
            throw new UnknownAccountException();

        }
//不考虑加密
      /*  SimpleAuthenticationInfo authenticationInfo=new SimpleAuthenticationInfo(
                user.getUsername(),
                user.getPassword(),
                this.getName()

        );
*/
//加密
        SimpleAuthenticationInfo authenticationInfo=new SimpleAuthenticationInfo(
                user.getUsername(),
                user.getPassword(),
                ByteSource.Util.bytes(user.getSalt()),
                this.getName()

        );


        return authenticationInfo;
    }
}
