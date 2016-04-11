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

package co.phoenixlab.discord.api.endpoints;

import co.phoenixlab.discord.api.entities.channel.DmChannel;
import co.phoenixlab.discord.api.entities.channel.PublicChannel;
import co.phoenixlab.discord.api.exceptions.ApiException;
import co.phoenixlab.discord.api.request.CreateChannelRequest;
import co.phoenixlab.discord.api.request.CreatePrivateChannelRequest;
import co.phoenixlab.discord.api.request.EditChannelRequest;

public interface ChannelsEndpoint {

    PublicChannel createChannel(long guildId, CreateChannelRequest request)
            throws ApiException;

    DmChannel createPrivateChannel(long myUserId, CreatePrivateChannelRequest request)
            throws ApiException;

    PublicChannel editChannel(long channelId, EditChannelRequest request)
            throws ApiException;

    void deleteChannel(long channelId)
            throws ApiException;

    PublicChannel[] getGuildChannels(long guildId)
            throws ApiException;

    void broadcastTyping(long channelId)
            throws ApiException;

}
