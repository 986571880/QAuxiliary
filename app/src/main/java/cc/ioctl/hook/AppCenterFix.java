/*
 * QAuxiliary - An Xposed module for QQ/TIM
 * Copyright (C) 2019-2022 qwq233@qwq2333.top
 * https://github.com/cinit/QAuxiliary
 *
 * This software is non-free but opensource software: you can redistribute it
 * and/or modify it under the terms of the GNU Affero General Public License
 * as published by the Free Software Foundation; either
 * version 3 of the License, or any later version and our eula as published
 * by QAuxiliary contributors.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * and eula along with this software.  If not, see
 * <https://www.gnu.org/licenses/>
 * <https://github.com/cinit/QAuxiliary/blob/master/LICENSE.md>.
 */

package cc.ioctl.hook;

import android.app.Application;
import android.os.Handler;
import androidx.annotation.NonNull;
import cc.ioctl.util.HostInfo;
import io.github.qauxv.BuildConfig;
import io.github.qauxv.util.Log;

public class AppCenterFix {

    // XREF: https://github.com/LSPosed/LSPosed/blob/11be039203f3b66d71baaad7cb91d8e9dc63958b/app/src/debug/java/org/lsposed/manager/util/Telemetry.java

    private AppCenterFix() {
    }

    /**
     * HostInfo must be initialized before AppCenterFix
     */
    public static void startAppCenter(@NonNull Application app, @NonNull String appSecret) {
    }
}
