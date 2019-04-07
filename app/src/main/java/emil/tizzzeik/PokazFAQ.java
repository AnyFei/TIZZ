package emil.tizzzeik;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class PokazFAQ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokaz_faq);
        TextView faqTV = findViewById(R.id.faqTV);
        faqTV.setText(" Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed ac sollicitudin nibh. Nullam porta non velit ac varius. Suspendisse ut lacinia nulla. Nam at nunc orci. Nam pharetra augue non facilisis blandit. Quisque rhoncus turpis sed tellus pellentesque, vitae fringilla purus sollicitudin. Phasellus non orci nulla. Aliquam dapibus tellus eu eros consectetur tincidunt. Praesent lobortis et elit eget ornare. Sed at risus porttitor, iaculis turpis ut, sodales ante. Donec porta eget ipsum feugiat interdum. Donec aliquet odio vel viverra tincidunt. Maecenas lectus ex, tempus id mi id, interdum eleifend erat. Phasellus sed ex ac ante ornare laoreet a sit amet diam.\n" +
                "\n" +
                "Sed ut ipsum tempor, bibendum velit eget, auctor erat. Maecenas ultricies vehicula malesuada. Nunc fermentum libero nec tortor tincidunt venenatis. Sed accumsan arcu nec libero dapibus tempus. Mauris id nisi libero. Vestibulum nec turpis luctus, blandit lectus vel, bibendum ante. Nullam iaculis ut nisi id aliquet. Integer tincidunt urna nec luctus consectetur. Proin pellentesque, quam quis fermentum aliquet, enim nibh blandit turpis, sit amet vulputate felis tortor et tellus. Quisque porta, ligula sit amet malesuada vestibulum, urna lectus luctus sapien, non mollis massa elit eget velit. Etiam in scelerisque metus. Vestibulum hendrerit neque lacus, malesuada facilisis eros egestas ac. Quisque vestibulum convallis est ut accumsan.\n" +
                "\n" +
                "Etiam id vehicula velit. Mauris mi risus, condimentum nec ornare vel, bibendum id quam. Nulla tempus tempor turpis, vitae congue arcu porttitor vitae. Sed ac nisi in mauris molestie feugiat. Nam scelerisque ultrices ligula, eu tincidunt velit feugiat at. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed fermentum justo vitae ante suscipit fermentum. Cras vulputate eu velit non dapibus. Sed a feugiat diam. Praesent non luctus sem. Vestibulum mattis sodales dolor, vitae venenatis velit. Nunc placerat volutpat lorem, vitae vehicula tortor tempus quis. Etiam vestibulum, mauris id viverra egestas, dolor justo lacinia eros, sed porttitor odio enim at lectus. Aliquam dui sapien, sodales ut magna non, ultrices accumsan nisl. Cras posuere ipsum malesuada, luctus ex ac, rutrum eros. ");
    }
}
