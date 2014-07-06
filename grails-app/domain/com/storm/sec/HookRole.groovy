package com.storm.sec

import java.io.Serializable
import java.util.Date
import com.storm.sec.Hook
import com.storm.sec.Role

class HookRole implements Serializable {

	Hook hook
	Role role
	Date dateCreated
	Date lastModified = new Date()

	static constraints = {
		hook(nullable:false)
		role(nullable:false)
	}
}
