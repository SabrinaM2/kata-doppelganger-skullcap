package info.doubles;
import info.User;
import info.Notifier;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FakeNotifier implements Notifier {
    private Set<User> notifedUsers;

    @Override
    public void notify(User user, String message) {
        if (notifedUsers == null) {
            notifedUsers = new HashSet<>();
        }

        notifedUsers.add(user);
    }

    public int getCount() {
        return notifedUsers.size();
    }
}
