/*
 * Copyright 2016 LINE Corporation
 *
 * LINE Corporation licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.linecorp.bot.model.action;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import lombok.Value;

/**
 * line-bot-model-5.0.3 で対応されていないクリップボードアクションを追加する
 *
 * @see <a href="https://developers.line.biz/ja/reference/messaging-api/#clipboard-action">//developers.line.me/en/reference/messaging-api/#clipboard-action</a>
 */
@Value
@JsonTypeName("clipboard")
@JsonInclude(Include.NON_NULL)
public class ClipboardAction implements Action {
    /**
     * Label for the action.
     *
     * <p>Max: 20 characters
     */
    String label;

    String clipboardText;

    @JsonCreator
    public ClipboardAction(
            @JsonProperty("label") String label,
            @JsonProperty("clipboardText") String clipboardText) {
        this.label = label;
        this.clipboardText = clipboardText;
    }
}
