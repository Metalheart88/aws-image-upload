package com.metalheart.awsimageupload.datastore;

import com.metalheart.awsimageupload.profile.UserProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.stereotype.Repository;

@Repository
public class FakeUserProfileDataStore {

  private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

  static {
    // Hard-coded UUID to show proper profile images in in-memory database. Otherwise can do UUID.randomUUID()
    USER_PROFILES.add(new UserProfile(UUID.fromString("9226dac8-cc9c-42e0-8d58-d423cc9505ff"), "Be$tiya", null));
    USER_PROFILES.add(
      new UserProfile(UUID.fromString("df3bec35-b1f8-4b5b-93a8-3bc7a32f96fd"), "Mr. Crowley", null)
    );
  }

  public List<UserProfile> getUserProfiles() {
    return USER_PROFILES;
  }
}
