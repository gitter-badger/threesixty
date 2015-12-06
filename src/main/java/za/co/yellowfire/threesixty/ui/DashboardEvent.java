package za.co.yellowfire.threesixty.ui;

import za.co.yellowfire.threesixty.domain.user.User;

//import com.vaadin.demo.dashboard.domain.Transaction;

/*
 * Event bus events used in Dashboard are listed here as inner classes.
 */
public abstract class DashboardEvent {

    public static final class UserLoginEvent {
        private final User user;

        public UserLoginEvent(final User user) {
            this.user = user;
        }
        public User getUser() { return user; }
    }

    public static class BrowserResizeEvent {

    }

    public static class UserLogoutEvent {

    }

    public static class NotificationsCountUpdatedEvent {
    }

    public static final class ReportsCountUpdatedEvent {
        private final int count;

        public ReportsCountUpdatedEvent(final int count) {
            this.count = count;
        }

        public int getCount() {
            return count;
        }

    }

//    public static final class TransactionReportEvent {
//        private final Collection<Transaction> transactions;
//
//        public TransactionReportEvent(final Collection<Transaction> transactions) {
//            this.transactions = transactions;
//        }
//
//        public Collection<Transaction> getTransactions() {
//            return transactions;
//        }
//    }

    public static final class PostViewChangeEvent {
        private final DashboardViewType view;

        public PostViewChangeEvent(final DashboardViewType view) {
            this.view = view;
        }

        public DashboardViewType getView() {
            return view;
        }
    }

    public static class CloseOpenWindowsEvent {
    }

    public static class ProfileUpdatedEvent {
    }

}