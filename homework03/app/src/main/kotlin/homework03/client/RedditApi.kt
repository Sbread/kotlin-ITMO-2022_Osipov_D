package homework03.client

object RedditApi {
    private const val reddit = "https://www.reddit.com"
    private const val json = "json"
    fun getTopicJSONURL(topicName : String) = "$reddit/r/$topicName/.$json"

    fun getTopicJSONAboutURL(topicName : String) = "$reddit/r/$topicName/about.$json"

    fun getCommentsJSONURL(topicName: String, title : String) = "$reddit/r/$topicName/comments/$title/.$json"
}