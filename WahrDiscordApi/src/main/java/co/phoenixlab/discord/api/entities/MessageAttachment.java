package co.phoenixlab.discord.api.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.Builder;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MessageAttachment implements Entity {

    private long id;
    private String filename;
    private String url;
    private String proxyUrl;
    private int size;

}
