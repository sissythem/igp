import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CardBackendComponent } from './card-backend.component';

describe('CardBackendComponent', () => {
  let component: CardBackendComponent;
  let fixture: ComponentFixture<CardBackendComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CardBackendComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CardBackendComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
