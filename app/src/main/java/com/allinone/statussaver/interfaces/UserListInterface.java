package com.allinone.statussaver.interfaces;


import com.allinone.statussaver.model.FBStoryModel.NodeModel;
import com.allinone.statussaver.model.story.TrayModel;

public interface UserListInterface {
    void userListClick(int position, TrayModel trayModel);
    void fbUserListClick(int position, NodeModel trayModel);
}
