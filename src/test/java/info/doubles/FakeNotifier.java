package info.doubles;
import info.User;
import info.Notifier;

import java.util.ArrayList;
import java.util.List;

public class FakeNotifier implements Notifier {
    private List<User> notifedUsers;

    @Override
    public void notify(User user, String message) {
        if (notifedUsers == null) {
            notifedUsers = new ArrayList<>();
        }

        notifedUsers.add(user);
    }

    public int getCount() {
        return notifedUsers.size();
    }
}
