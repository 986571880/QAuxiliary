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
package io.github.qauxv.util;

import android.app.Application;
import cc.ioctl.hook.AppCenterFix;
import cc.ioctl.util.HostInfo;
import io.github.qauxv.BuildConfig;
import io.github.qauxv.bridge.AppRuntimeHelper;
import io.github.qauxv.config.ConfigManager;
import java.util.HashMap;
import java.util.Map;

public class CliOper {

    private static final String TAG_IS_APP_CENTER_ALLOWED = "is_app_center_allowed";

    public static boolean isAppCenterAllowed() {
        return false;
    }

    public static void setAppCenterAllowed(boolean allowed) {
        ConfigManager.getDefaultConfig().putBoolean(TAG_IS_APP_CENTER_ALLOWED, false);
    }

    public static void __init__(Application app) {
    }

    public static void onLoad() {
    }

    public static void enterModuleActivity(String shortName) {
    }
}
