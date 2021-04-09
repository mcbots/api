package dev.comore.bot.policy;

import java.security.*;

public class AllGrantedPolicy extends Policy {
    @Override
    public PermissionCollection getPermissions(CodeSource codesource) {
        Permissions permissions = new Permissions();
        permissions.add(new AllPermission());

        return permissions;
    }
}
