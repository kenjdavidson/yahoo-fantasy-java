# Yahoo Fantasy Data (JAVA)

Common model definitions and XML parsing features.

## XML

Although JSON format is available, XML was chosen as I chose to take the small hit in performance (that some might argue with XML) for the benefit of being able to directly map the Models to the XML layout.

#### JSON

If you're interested in the differnce, JSON adds extra key wrappings to all list objects which makes it annoying to parse evently.  This was just a matter of choice, I personally don't like reading the JSON format as it is, and therefore decided against it.   

A couple examples of this are:

###### Users Collection

```xml
<?xml version="1.0" encoding="UTF-8"?>
<fantasy_content xml:lang="en-US" yahoo:uri="http://fantasysports.yahooapis.com/fantasy/v2/users;use_login=1/games;is_available=1/leagues" time="50.893068313599ms" copyright="Data provided by Yahoo! and STATS, LLC" refresh_rate="60" xmlns:yahoo="http://www.yahooapis.com/v1/base.rng" xmlns="http://fantasysports.yahooapis.com/fantasy/v2/base.rng">
    <users count="1">
        <user>
```

vs

```json
{
    "fantasy_content": {
        "xml:lang": "en-US",
        "yahoo:uri": "/fantasy/v2/users;use_login=1/games;is_available=1/leagues",
        "users": {
            "0": {
                "user": [
```

###### Games Collection

```xml
<games count="2">
	<game>
		<game_key>390</game_key>
		<game_id>390</game_id>
		<name>Football</name>
```

vs

```json
"games": {
	"0": {
		"game": [
			{
				"game_key": "390",
				"game_id": "390",
```
