Dec-28-2014: Attachments are not going to the database. Need to review postDocumentToNOSQL() -- FIXED

Jan-4-2015: Contacts collection structure:
{
	"FirstName" : "<>",
	"MiddleName" : "<>",
	"LastName" : "<>",
	"Sex" : "<>",
	"DateOfBirth" : "<>",
	
	"eMail": [
		{"email" : "<address>, "Desc" : <description like work, personal etc.>" }
	],

	"Phone": [
		{"Phone" : <number>, "Desc" : "<description like work, mobile etc.>" }
	],
 
	"PostalAddress": [
		{
			"BuildingName" : "<>",
			"StreetAddress" : "<>",
			"City" : "<>",
			"State": "<>",
			"Country" : "<>",
			"PostalCode" : "<>"
		}
	
	],
	
	"Organization": {
		"OrgContactID" : "<ContactID for Organization with address etc>",
		"OrgTitle" : "<>"
	},
	
	"PhotoIDs" : "<comma seperated list of photoIDs from photos collection>",
	"ContactID" : "<>"

}
