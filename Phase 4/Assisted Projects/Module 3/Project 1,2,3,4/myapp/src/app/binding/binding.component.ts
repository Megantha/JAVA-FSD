import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-binding',
  templateUrl: './binding.component.html',
  styleUrls: ['./binding.component.css']
})
export class BindingComponent implements OnInit {

  constructor() { }

  ngOnInit(): void{
  }

  products=[{name:"Pencil",price:"10",available:"16-09-2022",ratings:4.8},
            {name:"Eraser",price:"4.5",available:"16-09-2022",ratings:4.5},
            {name:"Pen",price:"5.5",available:"16-09-2022",ratings:5.0},
            {name:"Scale",price:"20",available:"16-09-2022",ratings:4.9},
            {name:"Book",price:"45",available:"16-09-2022",ratings:4.6},
  ];

name:string="MEGANTHA PALANIAPPAN";
url:string="http://www.google.com";
we:number=800;

flag=false;
show(){
  this.flag=!this.flag;
}





}
