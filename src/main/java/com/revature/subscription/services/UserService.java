package com.revature.subscription.services;

import java.util.List;

public class UserService {
    @Inject
    private final UserDAO userDAO;

    @Inject
    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public User login(String username, String password) {

        User user = new User();
        List<User> users = userDAO.getAll();

        for (User u : users) {
            if (u.getUsername().equals(username)) {
                user.setId(u.getId());
                user.setUsername(u.getUsername());
                user.setFirstname(u.getFirstname());
                user.setLastname(u.getLastname());
                user.setEmail(u.getEmail());

                if (u.getPassword().equals(password)) {
                    user.setPassword(u.getPassword());
                    break;
                }
            }
            if (u.getPassword().equals(password)) {
                user.setPassword(u.getPassword());
                break;
            }
        }

        return isValidCredentials(user);
    }

    public void register(User user) {
        userDAO.save(user);
    }
    public User getUserById(String id) {
        return userDAO.getById(id);
    }
    public boolean isValidUsername(String username) {
        if (username.matches("^(?=[a-zA-Z0-9._]{8,20}$)(?!.*[_.]{2})[^_.].*[^_.]$")) return true;
        throw new InvalidUserException("Invalid username. Username needs to be 8-20 characters long.");
    }

    public boolean isValidFirstname(String firstname) {
        boolean valid=true;
        if (firstname == null || firstname.length()==0){
            valid=false;
        }else{
            for(int i =0; i<firstname.length();i++){
                char c =Character.toUpperCase(firstname.charAt(i));//A-Z checking
                if(c<'A'||c>'Z'){
                    valid = false;
                    break;
                }
            }
        }
        if(valid){
            return true;
        }
        throw new InvalidUserException("Invalid firstname. At least 1 character required and only A-Z characters allowed");
    }


    public boolean isValidLastname(String lastname) {
        boolean valid=true;
        if (lastname == null || lastname.length()==0){
            valid=false;
        }else{
            for(int i =0; i<lastname.length();i++){
                char c =Character.toUpperCase(lastname.charAt(i));//A-Z checking
                if(c<'A'||c>'Z'){
                    valid = false;
                    break;
                }
            }
        }
        if(valid){
            return true;
        }
        throw new InvalidUserException("Invalid lastname. At least 1 character required and only A-Z characters allowed");
    }


    public boolean isValidEmail(String email) {
        boolean valid=true;
        if (email == null || email.length()==0){
            valid=false;
        }

        if(valid){
            return true;
        }
        throw new InvalidUserException("Invalid email. At least 1 character required and only A-Z characters allowed.");
    }

    public boolean isNotDuplicateEmailAddress(String emailAddress) {
        List<String> emailAddresses = userDAO.getAllEmailAddresses();
        if (emailAddresses.contains(emailAddress)) throw new InvalidUserException("Email address is already taken :(");
        return true;
    }

    public boolean isNonEmptyString(String string,String descr) {
        boolean valid=true;
        if (string == null || string.length()==0){
            valid=false;
        }

        if(valid){
            return true;
        }
        throw new InvalidUserException("Invalid "+descr+". At least 1 character required.");
    }




    public boolean isNotDuplicateUsername(String username) {
        List<String> usernames = userDAO.getAllUsernames();
        if (usernames.contains(username)) throw new InvalidUserException("Username is already taken :(");
        return true;
    }

    public boolean isValidPassword(String password) {
        if (password.matches("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$")) return true;
        throw new InvalidUserException("Invalid password. Minimum eight characters, at least one letter, one number and one special character.");
    }

    private User isValidCredentials(User user) {
        if (user.getUsername() == null && user.getPassword() == null)
            throw new InvalidUserException("Incorrect username and password.");
        else if (user.getUsername() == null) throw new InvalidUserException("Incorrect username.");
        else if (user.getPassword() == null) throw new InvalidUserException("Incorrect password.");

        return user;
    }

    public List<User> getUserByFirstnameLastname(String firstname, String lastname) {
        return userDAO.getByFirstnameLastname(firstname,lastname);

    }
}

}


