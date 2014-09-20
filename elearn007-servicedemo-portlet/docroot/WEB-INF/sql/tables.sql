create table elservice_Event (
	eventId LONG not null primary key,
	name VARCHAR(75) null,
	desciption VARCHAR(75) null,
	date_ DATE null,
	groupId LONG,
	companyId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	locationId LONG
);

create table elservice_Location (
	locationId LONG not null primary key,
	name VARCHAR(75) null,
	description VARCHAR(75) null,
	streetAddress VARCHAR(75) null,
	city VARCHAR(75) null,
	stateOrProvince VARCHAR(75) null,
	country VARCHAR(75) null,
	groupId LONG,
	companyId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null
);