package model;

public class UserFB {

    private String email;
    private String password;

    public static Builder newEntity() {
        return new UserFB().new Builder();
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public class Builder {
        private Builder() {
        }

        public Builder withEmail(String email) {
            UserFB.this.email = email;
            return this;
        }

        public Builder withPassword(String password) {
            UserFB.this.password = password;
            return this;
        }

        public UserFB build() {
            return UserFB.this;
        }
    }
}
