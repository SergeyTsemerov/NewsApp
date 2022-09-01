package com.sergeytsemerov.newsapp.models

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import kotlinx.parcelize.WriteWith

@Entity(
    tableName = "articles"
)
@Parcelize
data class Article(
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,
    val author: String?,
    val content: String?,
    val description: String?,
    val publishedAt: String?,
    val source: @WriteWith<SourceParceler> Source,
    val title: String?,
    val url: String?,
    val urlToImage: String?
) : Parcelable {

    override fun hashCode(): Int {
        var result = id.hashCode()
        if (author.isNullOrEmpty()) {
            result = 31 * result + author.hashCode()
        }
        if (content.isNullOrEmpty()) {
            result = 31 * result + content.hashCode()
        }
        if (description.isNullOrEmpty()) {
            result = 31 * result + description.hashCode()
        }
        if (publishedAt.isNullOrEmpty()) {
            result = 31 * result + publishedAt.hashCode()
        }
        if (source.id.isNullOrEmpty()) {
            result = 31 * result + source.id.hashCode()
        }
        if (source.name.isNullOrEmpty()) {
            result = 31 * result + source.name.hashCode()
        }
        if (title.isNullOrEmpty()) {
            result = 31 * result + title.hashCode()
        }
        if (url.isNullOrEmpty()) {
            result = 31 * result + url.hashCode()
        }
        if (urlToImage.isNullOrEmpty()) {
            result = 31 * result + urlToImage.hashCode()
        }
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Article

        if (id != other.id) return false
        if (author != other.author) return false
        if (content != other.content) return false
        if (description != other.description) return false
        if (publishedAt != other.publishedAt) return false
        if (source != other.source) return false
        if (title != other.title) return false
        if (url != other.url) return false
        if (urlToImage != other.urlToImage) return false

        return true
    }
}