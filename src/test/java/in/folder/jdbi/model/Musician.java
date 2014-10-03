package in.folder.jdbi.model;

import in.folder.jdbi.annotations.OneToMany;
import in.folder.jdbi.annotations.PrimaryKey;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.Builder;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Musician {
    @PrimaryKey
    private Integer id ;
    private String name;
    @OneToMany(name="album", type=Album.class)
    private List<Album> albums;
}