// Libs
import { useState, useEffect } from "react";
import axios from "axios";

// Components
import Dropzone from "../Dropzone/Dropzone";

// Styles
import "./UserProfiles.css";

const UserProfiles = () => {
  const [userProfiles, setUserProfiles] = useState([]);

  const fetchUserProfiles = () => {
    axios.get("http://localhost:8080/api/v1/user-profile").then((res) => {
      setUserProfiles(res.data);
    });
  };

  useEffect(() => {
    fetchUserProfiles();
  }, []);

  const renderUsers = () => {
    if (userProfiles.length) {
      return userProfiles.map((user, index) => {
        return (
          <div key={index}>
            {user.userProfileId && (
              <img
                className={"user-profiles-user-image"}
                src={`http://localhost:8080/api/v1/user-profile/${user.userProfileId}/image/download`}
                alt={"User Profile"}
              />
            )}
            <div className={"user-profiles-username"}>{user.username}</div>
            <div className={"user-profiles-user-profile-id"}>
              {user.userProfileId}
            </div>
            <Dropzone userProfileId={user.userProfileId} />
          </div>
        );
      });
    }

    return <div>No users were found.</div>;
  };

  return <div>{renderUsers()}</div>;
};

export default UserProfiles;
