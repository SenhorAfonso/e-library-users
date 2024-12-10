package com.sirafonso.e_library_users.core.domain.models;

public record UserModelIn(
    String name,
    String username,
    String email,
    String password
) {

    @Override
    public String toString() {
        return "UserModelIn{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static class Builder {
        private String name;
        private String username;
        private String email;
        private String password;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public UserModelIn build() {
            return new UserModelIn(
                name = this.name,
                username = this.username,
                email = this.email,
                password = this.password
            );
        }
    }

    public static Builder builder() {
        return new Builder();
    }
}
