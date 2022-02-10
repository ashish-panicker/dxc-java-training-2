import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-features',
  templateUrl: './features.component.html',
  styleUrls: ['./features.component.css'],
})
export class FeaturesComponent implements OnInit {
  constructor() {}

  ngOnInit(): void {}

  showFeatures = true;
  features = [
    {
      title: 'Feature 1',
      description:
        'Lorem ipsum dolor sit amet consectetur adipisicing elit. A, incidunt distinctio accusamus minus cum maiores. Quos sapiente ad sint alias molestiae maxime sit, excepturi minus rem minima doloremque quo reprehenderit pariatur dolorem veniam tempore in unde eius earum eaque deserunt architecto ducimus. Voluptatum officia distinctio vel eum cupiditate eos amet.',
      note: 'A Small note',
    },
    {
      title: 'Feature 2',
      description:
        'Lorem ipsum dolor sit amet consectetur adipisicing elit. A, incidunt distinctio accusamus minus cum maiores. Quos sapiente ad sint alias molestiae maxime sit, excepturi minus rem minima doloremque quo reprehenderit pariatur dolorem veniam tempore in unde eius earum eaque deserunt architecto ducimus. Voluptatum officia distinctio vel eum cupiditate eos amet.',
      note: 'A Small note',
    },
    {
      title: 'Feature 3',
      description:
        'Lorem ipsum dolor sit amet consectetur adipisicing elit. A, incidunt distinctio accusamus minus cum maiores. Quos sapiente ad sint alias molestiae maxime sit, excepturi minus rem minima doloremque quo reprehenderit pariatur dolorem veniam tempore in unde eius earum eaque deserunt architecto ducimus. Voluptatum officia distinctio vel eum cupiditate eos amet.',
      note: 'A Small note',
    },
    {
      title: 'Feature 3',
      description:
        'Lorem ipsum dolor sit amet consectetur adipisicing elit. A, incidunt distinctio accusamus minus cum maiores. Quos sapiente ad sint alias molestiae maxime sit, excepturi minus rem minima doloremque quo reprehenderit pariatur dolorem veniam tempore in unde eius earum eaque deserunt architecto ducimus. Voluptatum officia distinctio vel eum cupiditate eos amet.',
      note: 'A Small note',
    },
  ];
}
