package com.softwaremill.codebrag.dao.reporting.views

import java.util.Date

case class FollowupListView(followups: List[FollowupView])

case class FollowupView(followupId: String, userId: String, date: Date, commit: FollowupCommitView, lastCommentAuthorName: String)

case class FollowupCommitView(commitId: String, authorName: String, message: String, date: Date)