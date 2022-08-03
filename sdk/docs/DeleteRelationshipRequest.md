

# DeleteRelationshipRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sourceEntityId** | **Map&lt;String, String&gt;** | The identifier of the source entity of the relationship to be deleted. | 
**targetEntityId** | **Map&lt;String, String&gt;** | The identifier of the target entity of the relationship to be deleted. | 
**effectiveFrom** | **String** | The effective date of the relationship to be deleted |  [optional]
**effectiveUntil** | **String** | The effective datetime until which the relationship will be deleted. If not supplied the deletion will be permanent. |  [optional]


