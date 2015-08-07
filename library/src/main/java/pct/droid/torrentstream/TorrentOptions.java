/*
 *
 *  * This file is part of TorrentStreamer-Android.
 *  *
 *  * TorrentStreamer-Android is free software: you can redistribute it and/or modify
 *  * it under the terms of the GNU General Public License as published by
 *  * the Free Software Foundation, either version 3 of the License, or
 *  * (at your option) any later version.
 *  *
 *  * TorrentStreamer-Android is distributed in the hope that it will be useful,
 *  * but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  * GNU General Public License for more details.
 *  *
 *  * You should have received a copy of the GNU General Public License
 *  * along with TorrentStreamer-Android. If not, see <http://www.gnu.org/licenses/>.
 *
 */

package pct.droid.torrentstream;

import java.io.File;

public class TorrentOptions {

    protected String mSaveLocation;
    protected Boolean mUseWakeLock;

    public void setSaveLocation(String saveLocation) {
        mSaveLocation = saveLocation;
    }

    public void setSaveLocation(File saveLocation) {
        mSaveLocation = saveLocation.getAbsolutePath();
    }

    public void setUseWakeLock(Boolean useWakeLock) {
        mUseWakeLock = useWakeLock;
    }

}