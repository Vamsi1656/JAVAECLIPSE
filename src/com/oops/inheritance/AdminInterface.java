// In interface level multiple inheritance is supported.

package com.oops.inheritance;

public interface AdminInterface extends GuestInterface,DeveloperInterface {
	
	public void manage();

}
