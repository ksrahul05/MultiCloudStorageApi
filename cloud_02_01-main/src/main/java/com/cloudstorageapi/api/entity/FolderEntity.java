package com.cloudstorageapi.api.entity;

import javax.persistence.*;

@Entity
@Table(name = "Rahul_Folders")
public class FolderEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "folder_id", nullable = false)
	private int folderId;
     @Column(name="user_id",nullable=false)
     private int UserId;
	@Column(name = "folder_name", nullable = false)
	private String folderName;
	@Column(name = "parent_folder_id", nullable = false)
	private int parentFolderId;
	 
	@Column(name = "created_at", nullable = false)
	private int createdAt;
   public int getUserId()
  {
	return UserId;
   }
   public void setUserId(int UserId)
  {
	this.UserId=UserId;
  }
	public int getFolderId() {
		return folderId;
	}

	public void setFolderId(int folderId) {
		this.folderId = folderId;
	}

	public String getFolderName() {
		return folderName;
	}

	public void setFolderName(String folderName) {
		this.folderName = folderName;
	}

	public int getParentFolderId() {
		return parentFolderId;
	}

	public void setParentFolderId(int parentFolderId) {
		this.parentFolderId = parentFolderId;
	}

	public int getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(int createdAt) {
		this.createdAt = createdAt;
	}
 
 

}
