package org.example;

public class UserProfileUtils {
    public static String getName(UserProfile profile) {
        if (profile == null) {
            throw new NullPointerException("NULL");
        }
        return profile.getName();
    }
}
