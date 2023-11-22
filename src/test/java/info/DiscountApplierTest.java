package info;

import info.doubles.FakeNotifier;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class DiscountApplierTest {
    @Test
    void should_notify_twice_when_applying_discount_for_two_users_v1() {
        // TODO: write a test to demonstrate the bug in DiscountApplier.applyV1()

        FakeNotifier fakeNotifier = new FakeNotifier();
        DiscountApplier discountApplier = new DiscountApplier(fakeNotifier);
        ArrayList<User> users = new ArrayList<>(Arrays.asList(
                new User("User 1", "user1@test.com"),
                new User("User 2", "user2@test.com")
        ));

        discountApplier.applyV1(20, users);

        assert(fakeNotifier.getCount() == 2); // ensuring that 2 users are notified
    }

    @Test
    void should_notify_twice_when_applying_discount_for_two_users_v2() {
        // TODO: write a test to demonstrate the bug in DiscountApplier.applyV2()
        FakeNotifier fakeNotifier = new FakeNotifier();
        DiscountApplier discountApplier = new DiscountApplier(fakeNotifier);
        ArrayList<User> users = new ArrayList<>(Arrays.asList(
                new User("User 1", "user1@test.com"),
                new User("User 2", "user2@test.com")
        ));

        discountApplier.applyV2(20, users);
        assert(fakeNotifier.getCount() == 2); // ensuring that 2 different users are notified
    }

}
