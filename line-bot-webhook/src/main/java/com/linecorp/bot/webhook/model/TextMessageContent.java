/*
 * Copyright 2023 LINE Corporation
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

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech Do not edit the class manually.
 */
package com.linecorp.bot.webhook.model;



import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** TextMessageContent */
@JsonTypeName("text")
@JsonInclude(Include.NON_NULL)
@javax.annotation.Generated(value = "com.linecorp.bot.codegen.LineJavaCodegenGenerator")
public record TextMessageContent(
    /** Message ID */
    @JsonProperty("id") String id,
    /** Message text. */
    @JsonProperty("text") String text,
    /**
     * Array of one or more LINE emoji objects. Only included in the message event when the text
     * property contains a LINE emoji.
     */
    @JsonProperty("emojis") List<Emoji> emojis,
    /** Get mention */
    @JsonProperty("mention") Mention mention,
    /** Quote token to quote this message. */
    @JsonProperty("quoteToken") String quoteToken,
    /**
     * Message ID of a quoted message. Only included when the received message quotes a past
     * message.
     */
    @JsonProperty("quotedMessageId") String quotedMessageId)
    implements MessageContent {

  public static class Builder {
    private String id;
    private String text;
    private List<Emoji> emojis;
    private Mention mention;
    private String quoteToken;
    private String quotedMessageId;

    public Builder(String id, String text, String quoteToken) {

      this.id = id;

      this.text = text;

      this.quoteToken = quoteToken;
    }

    public Builder emojis(List<Emoji> emojis) {
      this.emojis = emojis;
      return this;
    }

    public Builder mention(Mention mention) {
      this.mention = mention;
      return this;
    }

    public Builder quotedMessageId(String quotedMessageId) {
      this.quotedMessageId = quotedMessageId;
      return this;
    }

    public TextMessageContent build() {
      return new TextMessageContent(id, text, emojis, mention, quoteToken, quotedMessageId);
    }
  }
}
