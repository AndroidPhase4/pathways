package com.Phase4.pathways

data class Hit(
    val _highlightResult: HighlightResult,
    val _tags: List<String>,
    val author: String,
    val comment_text: Any,
    val created_at: String,
    val created_at_i: Int,
    val num_comments: Int,
    val objectID: String,
    val parent_id: Any,
    val points: Int,
    val story_id: Any,
    val story_text: Any,
    val story_title: Any,
    val story_url: Any,
    val title: String,
    val url: String
)