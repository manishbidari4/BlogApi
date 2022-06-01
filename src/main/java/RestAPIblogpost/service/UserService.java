package RestAPIblogpost.service;

import RestAPIblogpost.model.user.User;
import RestAPIblogpost.payload.ApiResponse;
import RestAPIblogpost.payload.InfoRequest;
import RestAPIblogpost.payload.UserIdentityAvailability;
import RestAPIblogpost.payload.UserProfile;
import RestAPIblogpost.payload.UserSummary;
import RestAPIblogpost.security.UserPrincipal;

public interface UserService {

	UserSummary getCurrentUser(UserPrincipal currentUser);

	UserIdentityAvailability checkUsernameAvailability(String username);

	UserIdentityAvailability checkEmailAvailability(String email);

	UserProfile getUserProfile(String username);

	User addUser(User user);

	User updateUser(User newUser, String username, UserPrincipal currentUser);

	ApiResponse deleteUser(String username, UserPrincipal currentUser);

	ApiResponse giveAdmin(String username);

	ApiResponse removeAdmin(String username);

	UserProfile setOrUpdateInfo(UserPrincipal currentUser, InfoRequest infoRequest);

}