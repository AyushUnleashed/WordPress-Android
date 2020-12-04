package org.wordpress.android.ui.jetpack

import androidx.annotation.StringRes
import org.wordpress.android.R.string
import org.wordpress.android.ui.jetpack.BackupAvailableItemsProvider.BackupAvailableItemType.CONTENTS
import org.wordpress.android.ui.jetpack.BackupAvailableItemsProvider.BackupAvailableItemType.MEDIA_UPLOADS
import org.wordpress.android.ui.jetpack.BackupAvailableItemsProvider.BackupAvailableItemType.ROOTS
import org.wordpress.android.ui.jetpack.BackupAvailableItemsProvider.BackupAvailableItemType.SQLS
import org.wordpress.android.ui.jetpack.BackupAvailableItemsProvider.BackupAvailableItemType.THEMES
import org.wordpress.android.ui.jetpack.BackupAvailableItemsProvider.BackupAvailableItemType.PLUGINS
import javax.inject.Inject
import javax.inject.Singleton

/**
 * This class provides the available item choices for Jetpack Backup Download
 */
@Singleton
class BackupAvailableItemsProvider @Inject constructor() {
    fun getAvailableItems() : List<BackupAvailableItem> {
        return listOf(
                BackupAvailableItem(
                        THEMES,
                        string.backup_item_themes
                ),
                BackupAvailableItem(
                        PLUGINS,
                        string.backup_item_plugins
                ),
                BackupAvailableItem(
                        MEDIA_UPLOADS,
                        string.backup_item_media_uploads
                ),
                BackupAvailableItem(
                        SQLS,
                        string.backup_item_sqls
                ),
                BackupAvailableItem(
                        ROOTS,
                        string.backup_item_roots
                ),
                BackupAvailableItem(
                        CONTENTS,
                        string.backup_item_contents
                )
        )
    }

    data class BackupAvailableItem(
        val availableItemType: BackupAvailableItemType,
        @StringRes val labelResId: Int
    )

    enum class BackupAvailableItemType {
        THEMES,
        PLUGINS,
        MEDIA_UPLOADS,
        SQLS,
        ROOTS,
        CONTENTS
    }
}
