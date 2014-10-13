package in.folder.jdbi.model;

import in.folder.jdbi.annotations.ColumnName;
import in.folder.jdbi.annotations.OneToMany;
import in.folder.jdbi.annotations.OneToOne;
import in.folder.jdbi.annotations.PrimaryKey;
import lombok.*;
import lombok.experimental.Builder;

import java.math.BigDecimal;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class Movie {
    @PrimaryKey
    private Integer movieId;
    @ColumnName("name")
    private String movieName;

    @OneToMany(name = "song")
    private List<Song> songs;

    @OneToMany(name = "actor")
    private List<Actor> actors;

    @OneToOne(name = "director")
    private Director director;

    private BigDecimal ratings;

}
