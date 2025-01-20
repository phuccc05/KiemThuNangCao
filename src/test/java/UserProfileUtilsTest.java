import org.example.UserProfile;
import org.example.UserProfileUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserProfileUtilsTest {
    // Kiểm tra khi đối tượng hồ sơ hợp lệ
    @Test
    void testGetNameWithValidProfile() {
        UserProfile profile = new UserProfile("John Doe");
        assertEquals("John Doe", UserProfileUtils.getName(profile));
    }

    // Kiểm tra khi đối tượng hồ sơ là null
    @Test
    void testGetNameWithNullProfile() {
        assertThrows(NullPointerException.class, () -> UserProfileUtils.getName(null));
    }
}
