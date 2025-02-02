/*
 * Copyright (c) 2021 Huawei Device Co., Ltd.
 * Licensed under the Apache License,Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.huawei.codecdemo.camera.constant;

/**
 * CameraConst
 *
 * @since 2021-04-09
 */
public class CameraConst {
    /**
     * codec color model
     */
    public static final int CODEC_COLOR_MODEL = 21;

    /**
     * codec frame interval
     */
    public static final int CODEC_FRAME_INTERVAL = 1;

    /**
     * codec bitrate mode
     */
    public static final int CODEC_BITRATE_MODE = 1;

    /**
     * image capacity
     */
    public static final int IMAGE_RCV_CAPACITY = 4;

    /**
     * video file prefix
     */
    public static final String VIDEO_FILE_PREFIX = "VID_";

    /**
     * video file type
     */
    public static final String VIDEO_FILE_TYPE = ".mp4";

    private CameraConst() {
    }
}
