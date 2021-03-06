/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2016 Vincent Zhang/PhoenixLAB
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package co.phoenixlab.discord.api.entities.channel.message;

import co.phoenixlab.discord.api.entities.Entity;
import co.phoenixlab.discord.api.entities.user.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Message implements Entity {

    /**
     * ID of the message.
     */
    private long id;
    /**
     * ID of the channel the message was sent in.
     */
    private long channelId;
    /**
     * The {@link User} who is the author of the message.
     */
    private User author;
    /**
     * Contents of the message.
     */
    private String content;
    /**
     * When this message was sent.
     */
    private Instant timestamp;
    /**
     * When this message was edited (or null if never edited).
     */
    private Instant editedTimestamp;
    /**
     * Whether this is a TTS message.
     */
    private boolean tts;
    /**
     * Whether this message mentions everyone.
     */
    private boolean mentionEveryone;
    /**
     * Any users specifically mentioned in the message.
     */
    private User[] mentions;
    /**
     * Any attached files.
     */
    private Attachment[] attachments;
    /**
     * Any embedded content.
     */
    private Embed[] embeds;
    /**
     * Optional integer string used to validate if a message was sent.
     */
    private String nonce;

    @SuppressWarnings("EqualsWhichDoesntCheckParameterClass")
    @Override
    public boolean equals(Object o) {
        return Entity.areEqual(this, o);
    }

    @Override
    public int hashCode() {
        return Entity.hash(this);
    }
}
