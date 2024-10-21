/*
 * QAuxiliary - An Xposed module for QQ/TIM
 * Copyright (C) 2019-2024 QAuxiliary developers
 * https://github.com/cinit/QAuxiliary
 *
 * This software is an opensource software: you can redistribute it
 * and/or modify it under the terms of the General Public License
 * as published by the Free Software Foundation; either
 * version 3 of the License, or any later version as published
 * by QAuxiliary contributors.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the General Public License for more details.
 *
 * You should have received a copy of the General Public License
 * along with this software.
 * If not, see
 * <https://github.com/cinit/QAuxiliary/blob/master/LICENSE.md>.
 */

package com.xiaoniu.hook

import com.github.kyuubiran.ezxhelper.utils.hookReturnConstant
import io.github.qauxv.base.annotation.FunctionHookEntry
import io.github.qauxv.base.annotation.UiItemAgentEntry
import io.github.qauxv.dsl.FunctionEntryRouter
import io.github.qauxv.hook.CommonSwitchFunctionHook
import io.github.qauxv.util.QQVersion
import io.github.qauxv.util.requireMinQQVersion
import xyz.nextalone.util.method
import xyz.nextalone.util.throwOrTrue

@FunctionHookEntry
@UiItemAgentEntry
object DisableQCircleContactFriendsUpdate : CommonSwitchFunctionHook() {
    override val name = "禁用联系人顶部好友短视频更新"

    override val isAvailable = requireMinQQVersion(QQVersion.QQ_9_0_50)

    override val uiItemLocation = FunctionEntryRouter.Locations.Simplify.MAIN_UI_CONTACT

    override fun initOnce() = throwOrTrue {
        "Lcom/tencent/mobileqq/qcircle/api/impl/QCircleContactExpandBannerApiImpl;->isEnable()Z".method.hookReturnConstant(false)
    }

}