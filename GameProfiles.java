package edu.ncat.brickbreakerbackend;

import java.util.ArrayList;

public class GameProfiles {
    private PlayerProfile selectedProfile;
    private PlayerProfile highGameProfile;
    private ArrayList<PlayerProfile> profiles;
    private String profileFileName;

    public GameProfiles() {
        selectedProfile = null;
        highGameProfile = null;
        profiles = new ArrayList<>();
        profileFileName = null;
    }

    public String getProfileFileName() {
        return profileFileName;
    }

    public void setProfileFileName(String fname) {
        this.profileFileName = fname;
    }

    public PlayerProfile getSelectedProfile() {
        return selectedProfile;
    }

    public PlayerProfile getHighGameProfile() {
        return selectedProfile = highGameProfile;
    }

    public void setHighGameProfile(PlayerProfile prof) {
        this.highGameProfile = prof;
    }

    public int getNumPlayerProfiles() {
        return this.profiles.size();
    }

    public PlayerProfile getPlayerProfile(int index) {
        return this.profiles.get(index);
    }

    public void setPlayerProfile(int index, PlayerProfile pfile) {
         this.profiles.set(index, pfile);
    }

    public void addPlayerProfile(PlayerProfile pfile) {
        this.profiles.add(pfile);
    }

    public PlayerProfile deletePlayerProfile(int index) {
        return this.profiles.remove(index);
    }

    public void setSelectedProfile(PlayerProfile pfile) {
        this.selectedProfile = pfile;
    }

    public String toString() {
        String string6 = "";
        for (int i = 0; i < profiles.size(); i++) {
            string6 += profiles.get(i);
        }
        return string6;
    }
}
