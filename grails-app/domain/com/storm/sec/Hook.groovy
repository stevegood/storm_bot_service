package com.storm.sec

import java.io.Serializable
import java.util.Date

class Hook implements Serializable {

	static transactional = true
	static hasMany = [roles:HookRole]
	
	User user
	String callback
	String format = 'JSON'
	String service
	Long attempts = 0
	Date dateCreated
	Date lastModified = new Date()

	static constraints = {
		user()
		callback()
		format()
		service()
		attempts()
	}
}
